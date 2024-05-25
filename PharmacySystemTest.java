import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PharmacySystemTest {

    private PharmacySystem pharmacySystem;

    @BeforeEach
    public void setUp() {
        pharmacySystem = new PharmacySystem();
    }

    @Test
    public void testAddAndGetMedicationRequest() {
        int patientNumber = 1;
        String medicationName = "Paracetamol";
        int requiredDose = 500;

        pharmacySystem.addMedicationRequest(patientNumber, medicationName, requiredDose);

        MedicationRequest request = pharmacySystem.getMedicationRequest(patientNumber);

        assertNotNull(request, "Medication request should not be null");
        assertEquals(medicationName, request.getMedicationName(), "Medication name should match");
        assertEquals(requiredDose, request.getRequiredDose(), "Required dose should match");
    }

    @Test
    public void testGetMedicationRequestForNonExistentPatient() {
        int nonExistentPatientNumber = 99;

        MedicationRequest request = pharmacySystem.getMedicationRequest(nonExistentPatientNumber);

        assertNull(request, "Medication request should be null for a non-existent patient");
    }

    @Test
    public void testUpdateMedicationRequest() {
        int patientNumber = 2;
        String medicationName = "Ibuprofen";
        int requiredDose = 200;

        pharmacySystem.addMedicationRequest(patientNumber, medicationName, requiredDose);

        String updatedMedicationName = "Ibuprofen";
        int updatedRequiredDose = 400;

        pharmacySystem.addMedicationRequest(patientNumber, updatedMedicationName, updatedRequiredDose);

        MedicationRequest updatedRequest = pharmacySystem.getMedicationRequest(patientNumber);

        assertNotNull(updatedRequest, "Updated medication request should not be null");
        assertEquals(updatedMedicationName, updatedRequest.getMedicationName(), "Updated medication name should match");
        assertEquals(updatedRequiredDose, updatedRequest.getRequiredDose(), "Updated required dose should match");
    }
}
