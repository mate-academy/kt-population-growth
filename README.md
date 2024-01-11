# Population Growth task description

## Overview
In a small town, the initial population at the beginning of a year is `initialPopulation`. The population increases by a certain annual growth rate, in percentage, and additionally, a certain number of new inhabitants (`annualNewInhabitants`) come to live in the town each year. The task is to determine the number of years (`yearsRequired`) it takes for the town's population to become greater than or equal to a target population (`targetPopulation`).

## Calculation example
The population at the beginning of a year is `initialPopulation = 1000`. The population increases by 2 percent per year (`annualGrowthRate: 2 / 100 = 0.02)`, and additionally, 50 new inhabitants (`annualNewInhabitants`) come to live in the town each year. The task is to determine how many years it takes for the town's population to become greater than or equal to `targetPopulation = 1200` inhabitants.

- **General formula**:  
  `initialPopulation + initialPopulation * (annualGrowthRate / 100) + annualNewInhabitants` => New population

- **End of the 1st year**:

  `1000 + 1000 * 0.02 + 50` => 1070 inhabitants

- **End of the 2nd year**:  

  `1070 + 1070 * 0.02 + 50` => 1141 inhabitants  
  (*Note: the number of inhabitants is always an integer*)

- **End of the 3rd year**:  

  `1141 + 1141 * 0.02 + 50` => 1213 inhabitants

It takes **3 entire years** for the population to reach at least 1200 inhabitants.

## General task
Given parameters `initialPopulation`, `annualGrowthRate`, `annualNewInhabitants`, and `targetPopulation`, the function `calculateYearsToReachPopulation` should return the number of entire years needed to get a population greater or equal to `targetPopulation`.

- `initialPopulation`: An integer representing the initial number of inhabitants.
- `annualGrowthRate`: A positive or null floating number representing the annual population growth rate.
- `annualNewInhabitants`: An integer representing the number of new inhabitants coming or leaving each year.
- `targetPopulation`: An integer representing the population size to reach or surpass.

**Note**:
- The `annualGrowthRate` is a percentage. For example, if the growth rate is 2%, it should be used as 2.0 in the function.
- The population count at the end of each year is always an integer. Any fractional part is discarded (e.g., 252.8 rounds down to 252).

## Examples
1. `calculateYearsToReachPopulation(1500, 5.0, 100, 5000)` -> 15 years required
2. `calculateYearsToReachPopulation(1500000, 2.5, 10000, 2000000)` -> 10 years required

