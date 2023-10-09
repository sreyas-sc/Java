You can create bar charts using the popular Python library, Matplotlib. Here's how you can accomplish each of your tasks:

(i) Display a bar chart of the popularity of programming languages:
```python
import matplotlib.pyplot as plt

languages = ["Java", "Python", "PHP", "JavaScript", "C#", "C++"]
popularity = [22.2, 17.6, 8.8, 8, 77, 6.7]

plt.bar(languages, popularity)
plt.xlabel("Programming Languages")
plt.ylabel("Popularity")
plt.title("Popularity of Programming Languages")
plt.show()
```

(ii) Display a horizontal bar chart of the popularity of programming languages with red bars:
```python
import matplotlib.pyplot as plt

languages = ["Java", "Python", "PHP", "JavaScript", "C#", "C++"]
popularity = [22.2, 17.6, 8.8, 8, 77, 6.7]

plt.barh(languages, popularity, color='red')
plt.xlabel("Popularity")
plt.ylabel("Programming Languages")
plt.title("Popularity of Programming Languages (Red Bars)")
plt.show()
```

(iii) Display a bar chart of the popularity of programming languages with different colors for each bar:
```python
import matplotlib.pyplot as plt
import numpy as np

languages = ["Java", "Python", "PHP", "JavaScript", "C#", "C++"]
popularity = [22.2, 17.6, 8.8, 8, 77, 6.7]

colors = ['blue', 'green', 'orange', 'purple', 'red', 'pink']

plt.bar(languages, popularity, color=colors)
plt.xlabel("Programming Languages")
plt.ylabel("Popularity")
plt.title("Popularity of Programming Languages (Different Colors)")
plt.show()
```

These code snippets will create the desired bar charts using Matplotlib in Python. You can customize them further as needed.
