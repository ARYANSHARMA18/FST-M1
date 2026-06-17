SELECT customer_id, Max(purchase_amount) AS Max_Amount FROM orders
GROUP BY customer_id
ORDER BY Max_Amount;

SELECT salesman_id,order_date, Max(purchase_amount) AS Max_Amount FROM orders
WHERE order_date=TO_DATE('2012-08-17','YYYY-MM-DD')
GROUP BY salesman_id, order_date;

SELECT customer_id, order_date , Max(purchase_amount) AS Max_Amount FROM orders
GROUP BY customer_id, order_date
HAVING Max_Amount IN (2030, 3450, 5760, 6000);