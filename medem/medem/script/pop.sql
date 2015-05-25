INSERT INTO users(username,password,enabled)
VALUES ('armando','123456', TRUE);
INSERT INTO users(username,password,enabled)
VALUES ('test','123456', TRUE);
 
INSERT INTO user_roles (username, ROLE)
VALUES ('armando', 'ROLE_USER');
INSERT INTO user_roles (username, ROLE)
VALUES ('armando', 'ROLE_ADMIN');
INSERT INTO user_roles (username, ROLE)
VALUES ('test', 'ROLE_USER');
