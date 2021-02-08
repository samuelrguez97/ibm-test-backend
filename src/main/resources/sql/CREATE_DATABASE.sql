create database db_ibmtest;
create user 'springapiibm'@'%' identified by 'ibmtest';
grant all on db_ibmtest.* to 'springapiibm'@'%';
commit;