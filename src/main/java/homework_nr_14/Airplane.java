package homework_nr_14;

class Airplane {
    private String manufacturer;
    private String model;
    private int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEnginesException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty");
        }
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines must be greater than 0 and even");
        }
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfEngines = nrOfEngines;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", nrOfEngines=" + nrOfEngines +
                '}';
    }
}

class InvalidManufacturerException extends Exception {
    public InvalidManufacturerException(String message) {
        super(message);
    }
}

class InvalidModelException extends Exception {
    public InvalidModelException(String message) {
        super(message);
    }
}

class InvalidNrOfEnginesException extends Exception {
    public InvalidNrOfEnginesException(String message) {
        super(message);
    }
}

class InvalidRangeException extends Exception {
    public InvalidRangeException(String message) {
        super(message);
    }
}
