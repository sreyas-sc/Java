import matplotlib.pyplot as plt

# Programming languages and their popularity
languages = ['Java', 'Python', 'PHP', 'JavaScript', 'C#', 'C++']
popularity = [22.2, 17.6, 8.8, 8, 7.7, 6.7]

# Create a pie chart
plt.figure(figsize=(8, 8))
plt.pie(popularity, labels=languages, autopct='%1.1f%%', startangle=140)

# Add a title
plt.title('Popularity of Programming Languages')

# Display the pie chart
plt.show()
