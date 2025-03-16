CREATE TABLE  IF NOT EXISTS person_services (
  id int AUTO_INCREMENT,
  servise_name varchar(15),
  service_cost decimal(10,2),
  PRIMARY KEY (id)
) ;

insert ignore into person_services(id, servise_name, service_cost) values('1', 'Услуга1','200,00');
insert ignore into person_services(id, servise_name, service_cost) values('2', 'Услуга2','450,00');
insert ignore into person_services(id, servise_name, service_cost) values('3', 'Услуга3','600,00');