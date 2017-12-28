# technicalAssignment
Section A SQL

Question 1

CREATE TABLE users(
user_id  int(11),
email_id  varchar(200),
password  varchar(64),
first_name  varchar(128),
last_name  varchar(128),
enabled  bit default 0 not null
CONSTRAINT UK_USERS PRIMARY KEY (user_id)


CREATE TABLE user-singin_logs(
user_id  int(11),
session_id varchar(128),
signed_in_time  timestamp,
signed_out_time  timestamp,
CONSTRAINT UK_FK_USERS PRIMARY KEY (user_id,session_id),
CONSTRAINT FK_USERS FOREIGN KEY (user_id) REFERENCES users(user_id)
)


Question 2

SELECT a.user_id,signed_in_time,signed_out_time
FROM users a 
LEFT JOIN user_singin_logs b
ON a.user_id = b.user_id 
ORDER BY user_id DESC


Question 3

SELECT COUNT(DISTINCT user_id) 
FROM users


Question 4

SELECT user_id, COUNT(user_id)
FROM users
GROUP BY user_id
HAVING COUNT(user_id) > 1

Section B JAVA

Question 1 

 72 7 7 foo34 7foo
 
Question 2 is in the Sum2 jar file.
