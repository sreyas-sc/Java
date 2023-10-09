import matplotlib.pyplot as plt

# Sample Data
math_marks = [88, 92, 80, 89, 100, 80, 60, 100, 80, 34]
science_marks = [35, 79, 79, 48, 100, 88, 32, 45, 20, 30]
marks_range = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

# Create a scatter plot
plt.scatter(math_marks, science_marks, c=marks_range, cmap='viridis', marker='o')

# Add labels and title
plt.xlabel('Math Marks')
plt.ylabel('Science Marks')
plt.title('Scatter Plot of Math vs. Science Marks')

# Add a colorbar to indicate the marks range
cbar = plt.colorbar()
cbar.set_label('Marks Range')

# Show the plot
plt.show()

