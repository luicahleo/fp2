#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#
JAVAC=javac
JAVA=java
JAR=jar
OPCIONES= -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin
PRINCIPAL=fp2.poo.practica4luicahleo.principal.Principal

RUTACLASEPRINCIPAL=fp2/poo/practica4luicahleo/principal/
RUTACLASEEXCEPCION=fp2/poo/practica4luicahleo/excepcion/
RUTACLASEINTERFAZ=fp2/poo/practica4luicahleo/interfaz/
RUTACLASECLASE=fp2/poo/practica4luicahleo/clase/

DIRSRC=./src/
DIRBIN=./bin/
DIRJAR=./jar/

CLASEPRINCIPAL=Principal
CLASEVALORINCORRECTOEXCEPCION=ValorIncorrectoExcepcion
CLASEOPERACIONSUMAINTERFAZ=OperacionSumaInterfaz
CLASEOPERACIONSUMA=OperacionSuma

ejecutaJ: $(DIRJAR)$(CLASEPRINCIPAL).jar
	java -jar $(DIRJAR)$(CLASEPRINCIPAL).jar	

$(DIRJAR)$(CLASEPRINCIPAL).jar: $(DIRBIN)$(RUTACLASEPRINCIPAL)$(CLASEPRINCIPAL).class \
						   $(DIRBIN)$(RUTACLASECLASE)$(CLASEOPERACIONSUMA).class \
 						   $(DIRBIN)$(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).class \
 						   $(DIRBIN)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).class
	jar cvfe  $(DIRJAR)$(CLASEPRINCIPAL).jar $(PRINCIPAL)  -C  $(DIRBIN)  $(RUTACLASEPRINCIPAL)$(CLASEPRINCIPAL).class \
  													       -C  $(DIRBIN)  $(RUTACLASECLASE)$(CLASEOPERACIONSUMA).class \
													       -C  $(DIRBIN)  $(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).class \
													       -C  $(DIRBIN)  $(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).class
##########################################
# Compilación del fichero CLASEPRINCIPAL.java
##########################################
$(DIRBIN)$(RUTACLASEPRINCIPAL)$(CLASEPRINCIPAL).class: $(DIRBIN)$(RUTACLASECLASE)$(CLASEOPERACIONSUMA).class \
													   $(DIRBIN)$(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).class \
													   $(DIRBIN)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).class \
													   $(DIRSRC)$(RUTACLASEPRINCIPAL)$(CLASEPRINCIPAL).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEPRINCIPAL)$(CLASEPRINCIPAL).java
##########################################
# Compilación del fichero CLASEOPERACIONSUMA.java
##########################################
$(DIRBIN)$(RUTACLASECLASE)$(CLASEOPERACIONSUMA).class: $(DIRBIN)$(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).class \
													   $(DIRBIN)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).class \
													   $(DIRSRC)$(RUTACLASECLASE)$(CLASEOPERACIONSUMA).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASECLASE)$(CLASEOPERACIONSUMA).java
##########################################
# Compilación del fichero CLASEOPERACIONSUMAINTERFAZ.java
##########################################
$(DIRBIN)$(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).class: $(DIRBIN)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).class \
																	$(DIRSRC)$(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEINTERFAZ)$(CLASEOPERACIONSUMAINTERFAZ).java

##########################################
# Compilación del fichero CLASEVALORINCORRECTOEXCEPCION.java
##########################################
$(DIRBIN)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).class: $(DIRSRC)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).java
	javac $(OPCIONES) $(DIRSRC)$(RUTACLASEEXCEPCION)$(CLASEVALORINCORRECTOEXCEPCION).java