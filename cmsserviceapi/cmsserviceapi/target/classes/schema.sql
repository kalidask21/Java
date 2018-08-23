--------------- H2 ---------------

--Excut e if you want to start form fresh
--drop table facility;
--drop table kiosk;
--drop table printer;

--
-- Table structure for table `book`
--
create table if not exists kiosk (
  id INTEGER PRIMARY KEY,
  kiosk_name VARCHAR(255),
  printer_id VARCHAR(255)
);

create table if not exists facility(
  id INTEGER PRIMARY KEY,
  facility_name VARCHAR(255),
  facility_loc VARCHAR(255),
  facility_zip VARCHAR(255),
  faculty_kiosk_id INTEGER,
  foreign key (faculty_kiosk_id) references kiosk(id)
);




create table if not exists printer (
  printer_id INTEGER PRIMARY KEY,
  printer_name VARCHAR(255),
);
