#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#
JAVAC=javac
JAVA=java
JAR=jar
OPCIONES= -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin
PRINCIPAL=fp2.poo.practica3.Main

RUTACLASEMAIN=fp2/poo/practica3/
RUTACLASEPERSONA=fp2/poo/practica3/
RUTACLASEUSUARIO=fp2/poo/practica3luicahleo/
RUTACLASEUTIL=fp2/poo/utilidades/

DIRSRC=./src/
DIRBIN=./bin/
DIRJAR=./jar/

CLASEMAIN=Main
CLASEPERSONA=Persona
CLASEUSUARIO=Usuario
CLASECUENTA=Cuenta

ejecutaJ: $(DIRJAR)$(CLASEMAIN).jar
	java -jar $(DIRJAR)$(CLASEMAIN).jar
	
$(DIRJAR)$(CLASEMAIN).jar: $(DIRBIN)$(RUTACLASEMAIN)$(CLASEMAIN).class \
 						   $(DIRBIN)$(RUTACLASEUSUARIO)$(CLASEUSUARIO).class \
 						   $(DIRBIN)$(RUTACLASEPERSONA)$(CLASEPERSONA).class
	jar cvfe  $(DIRJAR)$(CLASEMAIN).jar $(PRINCIPAL)  -C  $(DIRBIN)  $(RUTACLASEMAIN)$(CLASEMAIN).class \
  													  -C  $(DIRBIN)  $(RUTACLASEUSUARIO)$(CLASEUSUARIO).class \
													  -C  $(DIRBIN)  $(RUTACLASEPERSONA)$(CLASEPERSONA).class
##########################################
# Compilación del fichero CLASEMAIN.java
##########################################
$(DIRBIN)$(RUTACLASEMAIN)$(CLASEMAIN).class: $(DIRBIN)$(RUTACLASEUSUARIO)$(CLASEUSUARIO).class \
										     $(DIRSRC)$(RUTACLASEMAIN)$(CLASEMAIN).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEMAIN)$(CLASEMAIN).java
##########################################
# Compilación del fichero CLASEUSUARIO.java
##########################################
$(DIRBIN)$(RUTACLASEUSUARIO)$(CLASEUSUARIO).class: $(DIRBIN)$(RUTACLASEPERSONA)$(CLASEPERSONA).class \
										           $(DIRSRC)$(RUTACLASEUSUARIO)$(CLASEUSUARIO).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEUSUARIO)$(CLASEUSUARIO).java

##########################################
# Compilación del fichero CLASEPERSONA.java
##########################################
$(DIRBIN)$(RUTACLASEPERSONA)$(CLASEPERSONA).class: $(DIRSRC)$(RUTACLASEPERSONA)$(CLASEPERSONA).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEPERSONA)$(CLASEPERSONA).java