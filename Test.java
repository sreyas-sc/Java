pip install matplotlib pandas

import matplotlib.pyplot as plt
import pandas as pd

# Read the data from the CSV file
data = pd.read_csv('medal.csv')

# Sort the data by gold medals in descending order
data = data.sort_values(by='gold_medal', ascending=False)

# Select the top 5 countries
top_countries = data.head(5)

# Create a pie chart
plt.figure(figsize=(8, 8))
plt.pie(top_countries['gold_medal'], labels=top_countries['country'], autopct='%1.1f%%', startangle=140)

# Add a title
plt.title('Gold Medal Achievements (Top 5 Countries) - 2016 Summer Olympics')

# Display the pie chart
plt.show()