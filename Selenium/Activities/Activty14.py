from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")

    print(driver.title)

    rows = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/thead/tr/th")
    cols = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr")

    print("No. of rows are " , len(rows))
    print("No. of cols are " , len(cols))

    bookName = driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]");
    print("Book Name --> Before Soring: " , bookName.text)

    driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/thead/tr/th[5]").click();

    bookName = driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]");
    print("Book Name --> After Soring: " , bookName.text)

    driver.quit()