
import matplotlib.pyplot as plt
import numpy as np

# Sample Data
groups = ['Group 1', 'Group 2', 'Group 3', 'Group 4', 'Group 5']
means_men = [22, 30, 35, 35, 26]
means_women = [25, 32, 30, 35, 29]

# Create an array of X positions for the groups
x = np.arange(len(groups))

# Set the width of the bars
bar_width = 0.35

# Create the bar plots for men and women
plt.bar(x - bar_width/2, means_men, bar_width, label='Men')
plt.bar(x + bar_width/2, means_women, bar_width, label='Women')

# Add labels, title, and legend
plt.xlabel('Groups')
plt.ylabel('Scores')
plt.title('Scores by Group and Gender')
plt.xticks(x, groups)
plt.legend()

# Show the plot
plt.show()

