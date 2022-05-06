# serviceEmployee
Web service tipo REST para devolver los empleados de una empresa

El web service funciona con la siguiente tabla en BD:

CREATE TABLE `employee` (
	`ID` INT(8) NOT NULL,
	`EMP_NAME` VARCHAR(20) NULL DEFAULT NULL,
	`PASSWORD` VARCHAR(20) NULL DEFAULT NULL,
	`GENDER` VARCHAR(20) NULL DEFAULT NULL,
	`BIRTHDAY` DATE NULL DEFAULT NULL,
	`DEP_ID` INT(8) NULL DEFAULT NULL,
	`IMP_ROLE_ID` INT(8) NULL DEFAULT NULL,
	`RANK` INT(8) NULL DEFAULT NULL,
	`TEL` VARCHAR(20) NULL DEFAULT NULL,
	`EMAIL` VARCHAR(30) NULL DEFAULT NULL,
	`INFO` VARCHAR(200) NULL DEFAULT NULL,
	PRIMARY KEY (`ID`)
)
COLLATE='latin1_general_ci'
;

URL de ejecución del servicio:
http://localhost:8094/employees

URL de ejecución de la documentación del servicio:
http://localhost:8094/serviceEmployee/swagger-ui/index.html
