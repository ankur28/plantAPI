# plantAPI
SpringBoot RESTful API with JPA
Created a spring Boot Rest Api performing CRUD operationsusing Entity Plant. Refer to src/main/resources/data.sql for Data file
Use Curl commands to make arequest to view th result JSON :
 -- Refer to Controller mappings to look for endpoints to hit -- 
 
curl "localhost:8080/plants/search?hasFruit=false&maxQuantity=20"
![image](https://user-images.githubusercontent.com/19842120/132986244-043b1176-8857-4e38-9a32-dd4acefbb6e0.png)

 
curl "localhost:8080/plants/search?hasFruit=false"
![image](https://user-images.githubusercontent.com/19842120/132986235-fc62a42e-82da-4448-9af1-87abb9362ab2.png)

 
curl "localhost:8080/plants/search?hasFruit=true"
![image](https://user-images.githubusercontent.com/19842120/132986226-be372f89-9050-46e8-9c63-2bc56be713be.png)

 
curl "localhost:8080/plants/search?hasFruit=true&maxQuantity=10"
 ![image](https://user-images.githubusercontent.com/19842120/132986217-a0023785-483a-4cc7-8700-f97525719dd9.png)

curl "localhost:8080/plants/search?maxQuantity=10"
![image](https://user-images.githubusercontent.com/19842120/132986177-5c613927-0fbe-4ac2-bea6-fc373c3dc6d8.png)
