### Desarrollado por Victoria Daghe
**Comisión**: 3K10

## 📌 Descripción
Mutant Detector es una aplicación diseñada para identificar si una secuencia de ADN corresponde a un mutante y se permite obtener estadisticas.
## 🔗 Enlace a Render
Accede a la aplicación en Render: https://parcialmutantes-victoriadaghe.onrender.com
## 🚀 Probar Proyecto
Se debe utilizar Postman:  
puede descagar y ejecutar el proyecto o utilizar el link de render


### 1. POST `/mutant`
#### Ejemplo de Secuencias
```json
mutante:<br>
{
  "dna": ["ATGCGC", "CAGTGC", "TTATGG", "AGAAGG", "CCCCTA", "TCACTG"]
}
humana:<br>
```json
{
  "dna": ["ATGCGA", "CAGTGC", "TTATTT", "AGACGG", "GCGTCA", "TCACTG"]
}

### 2. GET `/stats`
Obtiene las estadisticas
