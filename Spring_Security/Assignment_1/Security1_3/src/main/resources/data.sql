INSERT INTO users (username, password, enabled)
      values('user','pass',true);


INSERT INTO users (username, password, enabled)
      values ('admin','pass',true);

INSERT INTO authorities (username, authority)
      values ('admin', 'ROLE_USER');

INSERT INTO users (username, authority)
      values ('admin', 'ROLE_USER');