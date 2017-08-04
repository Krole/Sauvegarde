drop database if exists `bibliotheque_audio`;

create database `bibliotheque_audio`;
use `bibliotheque_audio`;

create table `disques` (
	`id` VARCHAR(50) NOT NULL,
	`nom` TEXT,
	PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

create table `chansons` (
	`id` INT NOT NULL auto_increment,
	`disque_id` VARCHAR(50),
	`nom` TEXT,
	`duree` INT,
	PRIMARY KEY(`id`),
	FOREIGN KEY (`disque_id`) REFERENCES `disques` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


select * from disques;

insert into `disques` (`id`,`nom`) VALUES ('pefafhs', 'Au clair de la lune');
insert into `chansons` (`disque_id`,`nom`, `duree`) VALUES ('pefafhs', 'Toto', 666);
insert into `chansons` (`disque_id`,`nom`, `duree`) VALUES ('aaa', 'Toto', 666);

delete from `disques` where id='pefafhs';
    
select * from chansons;

    
    
    

