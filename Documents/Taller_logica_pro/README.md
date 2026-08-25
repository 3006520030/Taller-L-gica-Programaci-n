# Taller: Variables y Condicionales — Java

Taller  individual del curso de programación (unidad "Variables y Condicionales").


## Estructura del repositorio  

```
.
├── Variables.java      # Punto 4-6-8: 20 variables de distintos tipos
├── Ecuaciones.java      # Menú con las 2 ecuaciones (puntos 1-2 y evaluación)
├── README.md
└── .gitignore
```

## Requisitos

- JDK 8 o superior instalado (`javac -version` para verificar).

## Cómo compilar y ejecutar

### Variables.java

```bash
javac Variables.java
java Variables
```

Imprime los 20 valores antes y después de la reasignación.

### Ecuaciones.java

```bash
javac Ecuaciones.java
java Ecuaciones
```

Muestra un menú (1. Ecuación 1 / 2. Ecuación 2 / 3. Salir) que se repite hasta
elegir "Salir". Pide `x` y `z` por teclado y muestra el resultado de `y`.

## Ecuaciones resueltas

- **Ecuación 1:** `y = [3x/(1+3x)] / [(3z²+2) / (1/(1+z) + 3x²+2z+3)]`
- **Ecuación 2:** `y = (x²+3z+2)/(2+1/(1+2z)) + [2/(1+3x³+3z+2)] / [1/(1+3x) + (3x+1)/(2z+3/(1+5/z))]`


## Presentación

Enlace a las diapositivas: `[https://upbeduco-my.sharepoint.com/:p:/r/personal/santiago_mejiaga_upb_edu_co/_layouts/15/Doc.aspx?sourcedoc=%7BDC9F2590-B5F9-4ACD-A84F-467B6EA91295%7D&file=Taller_Variables_Condicionales.pptx&action=edit&mobileredirect=true&DefaultItemOpen=1&wdOrigin=APPHOME-WEB.DIRECT%2CAPPHOME-WEB.JUMPBACKIN&wdPreviousSession=2227651d-279e-4c0b-a599-029ef6351933&wdPreviousSessionSrc=AppHomeWeb&ct=1787117509538]`

## Control de versiones (Git)

- Nombre y correo configurados con `git config user.name` / `git config user.email`.
- Historial actualizado con `git commit --amend --author` y `git rebase -i` para
  corregir la autoría de commits anteriores.
- Mínimo 10 commits distintos registrados durante el desarrollo.

## Bitácora paso a paso

| # | Fecha | Commit (resumen) | Descripción |
|---|-------|-------------------|-------------|
| 1 | `[19/08/2026]` | `[commit inicial]` | Estructura inicial del repositorio |
| 2 | `[19/08/2026]` | `[creacion del readme.md]` | Se crea el readme.md en main |
| 3 | `[19/08/2026]` | `[Se añaden archivos]` | Se sube el contenido de los archivos |
| 4 | `[19/08/2026]` | `[Correción link]` | Se corrige link de las diapositivas |
| 5 | `[19/08/2026]` | `[readme.md]` | Actualización del readme.md |
| 6 | `[19/08/2026]` | `[Reasignación variables]` | Reasignación de variables (5 desde otras variables) |
| 7 | `[19/08/2026]` | `[Se agrega un ciclo]` | do-while que no acaba hasta usar la opción 3 |
| 8 | `[19/08/2026]` | `[División entre 0]` | Agrega la opción de que el denominador no pueda dividir entre 0 |
| 9 | `[19/08/2026]` | `[.gitignore]` | Se recupera el .gitignore que fue removido por accidente |
| 10 | `[19/08/2026]` | `[Revisión Final]` | Ajustes finales / README |



## Conclusiones, dudas y aprendizajes

Ver la última diapositiva de la presentación.

## Autor

`[Santiago Mejía]`
