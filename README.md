# plantAPI
SpringBoot RESTful API with JPA
Created a spring Boot Rest Api performing CRUD operationsusing Entity Plant.
Use Curl commands to make arequest to view th result JSON :

curl "localhost:4001/plants/search?hasFruit=false&maxQuantity=20"
 
curl "localhost:4001/plants/search?hasFruit=false"
 
curl "localhost:4001/plants/search?hasFruit=true"
 
curl "localhost:4001/plants/search?hasFruit=true&maxQuantity=10"
 
curl "localhost:4001/plants/search?maxQuantity=10"
