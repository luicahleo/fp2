#
#   Makefile de ejemplo para la compilación, creación del jar y ejecución
#

# CLASEPPAL es el nombre de la clase que contiene el metodo principal (main)
CLASEPPAL=Ejercicio01

JAVAC=javac
JAVA=java
JAR=jar
OPCIONES= -Xlint -encoding ISO-8859-1 -classpath ./bin  -cp ./bin -d ./bin 	

##########################################
# Generacion del .jar
##########################################
Ejemplo01.jar: ./bin/fp2/poo/practica1/Ejercicio01.class \
               ./bin/fp2/poo/practica1/Calculadora.class
	jar cvfe ./jar/Ejercicio01.jar fp2.poo.practica1.Ejercicio01  \
	                        -C ./bin ./fp2/poo/practica1/Ejercicio01.class \
	                        -C ./bin ./fp2/poo/practica1/Calculadora.class 
	java -jar ./jar/Ejercicio01.jar 
              
##########################################
# Ejecución del fichero Ejercicio01
##########################################
ejecucion: 
	java -classpath ./bin:./jar -cp bin fp2.poo.practica1.Ejercicio01

##########################################
# Compilación del fichero Ejercicio01.java
##########################################
./bin/fp2/poo/practica1/Ejercicio01.class: \
              ./bin/fp2/poo/practica1/Calculadora.class \
						  ./src/fp2/poo/practica1/Ejercicio01.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/practica1/Ejercicio01.java

##########################################
# Compilación del fichero Calculadora.java
##########################################
./bin/fp2/poo/practica1/Calculadora.class: \
						  ./src/fp2/poo/practica1/Calculadora.java
	$(JAVAC) $(OPCIONES) ./src/fp2/poo/practica1/Calculadora.java
	
	


	
