DROP TABLE IF EXISTS Users;  
Create Table Users(
  id INT AUTO_INCREMENT  PRIMARY KEY,  
  username VARCHAR(25) NOT NULL,   
  password VARCHAR(500) NOT NULL,  
  name VARCHAR(100) NOT NULL,  
  email  VARCHAR(50) NOT NULL, 
  mobile INT NOT NULL,
  dob DATE, 
  updateddatetime DATE
);

DROP TABLE IF EXISTS Floors;  
Create Table Floors( 
  id INT AUTO_INCREMENT  PRIMARY KEY,  
  name VARCHAR(25) NOT NULL,   
  description VARCHAR(500) NOT NULL,  
  updatedtime DATE
);

DROP TABLE IF EXISTS Seats; 
Create Table Seats(
id INT AUTO_INCREMENT PRIMARY KEY,
floorid INT references Floors(id),
seatnumber INT NOT NULL,
description VARCHAR(500) NOT NULL, 
status VARCHAR(50) NOT NULL, 
updatedtime DATE
)

