#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#
JAVAC=javac
JAVA=java
JAR=jar
OPCIONES= -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin
PRINCIPAL=fp2.poo.practica2luicahleo.CuentaPrincipal

RUTACLASEMAIN=fp2/poo/practica2luicahleo/
RUTACLASEUTIL=fp2/poo/utilidades/

DIRSRC=./src/
DIRBIN=./bin/
DIRJAR=./jar/

CLASEMAIN=CuentaPrincipal
CLASECUENTA=Cuenta

ejecutaJ: $(DIRJAR)$(CLASEMAIN).jar
	java -jar $(DIRJAR)$(CLASEMAIN).jar
	
$(DIRJAR)$(CLASEMAIN).jar: $(DIRBIN)$(RUTACLASEMAIN)$(CLASEMAIN).class \
						   $(DIRBIN)$(RUTACLASEUTIL)$(CLASECUENTA).class
	jar cvfe  $(DIRJAR)$(CLASEMAIN).jar $(PRINCIPAL)  -C  $(DIRBIN)  $(RUTACLASEMAIN)$(CLASEMAIN).class \
 													  -C  $(DIRBIN)  $(RUTACLASEUTIL)$(CLASECUENTA).class

##########################################
# Compilación del fichero CLASEMAIN.java
##########################################
$(DIRBIN)$(RUTACLASEMAIN)$(CLASEMAIN).class: $(DIRBIN)$(RUTACLASEUTIL)$(CLASECUENTA).class \
										     $(DIRSRC)$(RUTACLASEMAIN)$(CLASEMAIN).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEMAIN)$(CLASEMAIN).java
##########################################
# Compilación del fichero CLASECUENTA.java
##########################################
$(DIRBIN)$(RUTACLASEUTIL)$(CLASECUENTA).class: $(DIRSRC)$(RUTACLASEUTIL)$(CLASECUENTA).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEUTIL)$(CLASECUENTA).java

