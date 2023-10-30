

import pandas as pd

data = {
    'Name': ['Alice', 'Bob', 'Charlie'],
    'Age': [25, 30, 22]
}

custom_index = ['one', 'two', 'three']
df = pd.DataFrame(data, index=custom_index)

df_reset = df.reset_index(drop=True)

print(df_reset)
