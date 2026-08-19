# Taller: Variables y Condicionales — Java

Taller individual del curso de programación (unidad "Variables y Condicionales").


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

Enlace a las diapositivas: `[https://github.com/3006520030/Taller-L-gica-Programaci-n.git]`

## Control de versiones (Git)

- Nombre y correo configurados con `git config user.name` / `git config user.email`.
- Historial actualizado con `git commit --amend --author` y `git rebase -i` para
  corregir la autoría de commits anteriores.
- Mínimo 10 commits distintos registrados durante el desarrollo.

## Bitácora paso a paso

| # | Fecha | Commit (resumen) | Descripción |
|---|-------|-------------------|-------------|
| 1 | `[fecha]` | `[hash o mensaje]` | Estructura inicial del repositorio |
| 2 | `[fecha]` | `[hash o mensaje]` | Declaración de las 20 variables en Variables.java |
| 3 | `[fecha]` | `[hash o mensaje]` | Inicialización de variables |
| 4 | `[fecha]` | `[hash o mensaje]` | Reasignación de variables (5 desde otras variables) |
| 5 | `[fecha]` | `[hash o mensaje]` | Menú de Ecuaciones.java (opciones 1-3) |
| 6 | `[fecha]` | `[hash o mensaje]` | Implementación ecuación 1 |
| 7 | `[fecha]` | `[hash o mensaje]` | Implementación ecuación 2 |
| 8 | `[fecha]` | `[hash o mensaje]` | Corrección de nombre/correo en commits anteriores |
| 9 | `[fecha]` | `[hash o mensaje]` | Diapositivas de la presentación |
| 10 | `[fecha]` | `[hash o mensaje]` | Ajustes finales / README |



## Conclusiones, dudas y aprendizajes

Ver la última diapositiva de la presentación.

## Autor

`[Santiago Mejía]`
