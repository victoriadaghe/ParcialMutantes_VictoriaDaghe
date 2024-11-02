# Mutant Detector

### Desarrollado por: Victoria Daghe  
**Comisión**: 3K10

## 📌 Descripción
**Mutant Detector** es una aplicación diseñada para identificar si una secuencia de ADN corresponde a un mutante. También permite obtener estadísticas sobre las secuencias procesadas.

## 🔗 Enlace a Render
Accede a la aplicación en Render: [https://parcialmutantes-victoriadaghe.onrender.com](https://parcialmutantes-victoriadaghe.onrender.com)

## 🚀 Probar el Proyecto
Para probar el proyecto, puedes utilizar **Postman**.  
Puedes descargar y ejecutar el proyecto localmente o utilizar el enlace en Render.

### Endpoints

#### 1. POST `/mutant`
Este endpoint recibe una secuencia de ADN y determina si corresponde a un mutante.

##### Ejemplos de Secuencias

Mutante:

{
  "dna": ["ATGCGC", "CAGTGC", "TTATGG", "AGAAGG", "CCCCTA", "TCACTG"]
}
Humano:

{
  "dna": ["ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG"]
}

#### 2. GET `/stats`
Obtiene las estadisticas
