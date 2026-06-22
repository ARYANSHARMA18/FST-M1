import pandas as pd

data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe = pd.DataFrame(data)

print(dataframe)

writer = pd.ExcelWriter('newFile.xlsx')

dataframe.to_excel(writer, sheet_name='Sheet1', index=False)
writer.close()


