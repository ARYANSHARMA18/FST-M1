import pandas as pd

dataframe = pd.read_excel('./newFile.xlsx')

print("")
print("Data: ")
print(dataframe)

print("")
print("No of rows & columns are: ",dataframe.shape)

print("")
print("Data in Emails columns is: ")
print(dataframe["Email"])

print("")
print("Sorted By First Name: ")
print(dataframe.sort_values("FirstName"))