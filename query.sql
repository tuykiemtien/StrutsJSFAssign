-- =============================================
-- Create database template
-- =============================================
USE master
GO

-- Drop the database if it already exists
IF  EXISTS (
	SELECT name 
		FROM sys.databases 
		WHERE name = N'Struts'
)
DROP DATABASE Struts
GO

CREATE DATABASE Struts
GO

USE Struts

GO
CREATE TABLE News
(
	NewsID INT PRIMARY KEY IDENTITY(1,1),
	NewsName NVARCHAR(100),
	NewsStaff NVARCHAR(100),
	NewsDepartment NVARCHAR(100),
	NewsOutDate DATE,
	NewsNumber INT,
	NewsStatus NVARCHAR(100),
	NewsDescription NVARCHAR(500)
)

GO
CREATE TABLE [Users]
(
	UsersID INT PRIMARY KEY IDENTITY(1,1),
	UsersName NVARCHAR(100),
	UsersPhone VARCHAR(11),
	UsersMail VARCHAR(100),
	UsersCV VARCHAR(100)
)

