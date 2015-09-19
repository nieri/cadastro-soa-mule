CREATE DATABASE cadastro;<br>
CREATE USER 'sa'@'localhost' IDENTIFIED BY 'sa';<br>
GRANT ALL PRIVILEGES ON cadastro.* TO sa@localhost IDENTIFIED BY 'sa';<br>
FLUSH PRIVILEGES;
