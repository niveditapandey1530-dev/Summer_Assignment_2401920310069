package Week_3.OOPS.RailCoach;
class Luggage extends Compartment {

    @Override
    public String notice() {
        return "Luggage Compartment: Passengers are not allowed inside.";
    }
}
