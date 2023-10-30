import pandas as pd

data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Eva'],
    'Age': [30, 25, 22, 30, 28],
    'City': ['New York', 'Los Angeles', 'Chicago', 'New York', 'Los Angeles']
}
df = pd.DataFrame(data)
sorted_df = df.sort_values(by=['Age', 'City'], ascending=[True, True])
print(sorted_df)
