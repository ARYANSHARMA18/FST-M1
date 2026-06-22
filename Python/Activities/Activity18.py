import pandas as pd

dataframe = pd.read_csv("./newFile.csv")

print("")
print("Table:")
print(dataframe)

print("")
print("Usernames: ")
print(dataframe["Usernames"])

print("")
print("Username: " , dataframe["Usernames"][1] ,"||" , "Password: ", dataframe["Passwords"][1])

print("")
print("Sorted by ascending Usernames:")
print(dataframe.sort_values("Usernames"))

print("")
print("Sorted by descending Passwords:")
print(dataframe.sort_values("Passwords",ascending= False))