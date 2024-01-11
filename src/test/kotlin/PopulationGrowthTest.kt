import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PopulationGrowthTest {

    @Test
    fun calculateYearsToReachPopulation_StandardInputs_CorrectYears() {
        // given
        val initialPopulation = 1500
        val annualGrowthRate = 5.0
        val annualNewInhabitants = 100
        val targetPopulation = 5000

        // when
        val years =
            calculateYearsToReachPopulation(initialPopulation, annualGrowthRate, annualNewInhabitants, targetPopulation)

        // then
        assertEquals(15, years)
    }

    @Test
    fun calculateYearsToReachPopulation_ZeroGrowthRate_NoChangeInYears() {
        // given
        val initialPopulation = 1000
        val annualGrowthRate = 0.0
        val annualNewInhabitants = 50
        val targetPopulation = 1050

        // when
        val years =
            calculateYearsToReachPopulation(initialPopulation, annualGrowthRate, annualNewInhabitants, targetPopulation)

        // then
        assertEquals(1, years)
    }

    @Test
    fun calculateYearsToReachPopulation_HighGrowthRate_SmallNumberOfYears() {
        // given
        val initialPopulation = 1000
        val annualGrowthRate = 20.0
        val annualNewInhabitants = 100
        val targetPopulation = 2000

        // when
        val years =
            calculateYearsToReachPopulation(initialPopulation, annualGrowthRate, annualNewInhabitants, targetPopulation)

        // then
        assertEquals(3, years)
    }
}
