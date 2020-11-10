CREATE SEQUENCE  USER_ACCOUNT_SEQ;

CREATE  TABLE  USER_ACCOUNT(
                               id Integer PRIMARY KEY ,
                               username VARCHAR(50) NOT NULL UNIQUE ,
                               email VARCHAR(50) NOT NULL UNIQUE ,
                               phone VARCHAR(50) NOT NULL UNIQUE ,
                               address VARCHAR(100) NOT NULL ,
                               firstName VARCHAR(50) NOT NULL ,
                               lastName VARCHAR(50) NOT NULL

);