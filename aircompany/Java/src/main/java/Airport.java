package planes;

import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.List;

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : this.planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);

            }
            return militaryPlanes;
        }

        public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity () {
            List<PassengerPlane> passengerPlanes = getPassengerPlane();
            PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
            for (int i = 1; i < passengerPlanes.size(); i++) {
                if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                    planeWithMaxCapacity = passengerPlanes.get(i);
                }
            }
            return planeWithMaxCapacity;
        }

        public List<MilitaryPlane> getTransportMilitaryPlanes () {
            List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
            List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
            for (int i = 0; i < militaryPlanes.size(); i++) {
                MilitaryPlane plane = militaryPlanes.get(i);
                if (plane.getType() == militaryType.TRANSPORT) {
                    transportMilitaryPlanes.add(plane);
                }
            }
            return transportMilitaryPlanes;
        }

        public List<MilitaryPlane> getBomberMilitaryPlanes () {
            List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
            List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
            for (int i = 0; i < militaryPlanes.size(); i++) {
                MilitaryPlane plane = militaryPlanes.get(i);
                if (plane.getType() == militaryType.BOMBER) {
                    bomberMilitaryPlanes.add(plane);
                }
            }
            return bomberMilitaryPlanes;
        }

        public List<ExperimentalPlane> getExperimentalPlanes () {
            List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
            for (Plane plane : planes) {
                if (plane instanceof ExperimentalPlane) {
                    experimentalPlanes.add((ExperimentalPlane) plane);
                }
            }
            return experimentalPlanes;
        }

        public Airport sortByMaxDistance () {
            Collections.sort(planes, new Comparator<Plane>() {
                public int compare(Plane plane1, Plane plane2) {
                    return plane1.getMaxFlightDistance() - plane2.getMaxFlightDistance();
                }
            });
            return this;
        }

        public Airport sortByMaxSpeed () {
            Collections.sort(planes, new Comparator<Plane>() {
                public int compare(Plane plane1, Plane plane2) {
                    return plane1.getMaxSpeed() - plane2.getMaxSpeed();
                }
            });
            return this;
        }

        public Airport sortByMaxLoadCapacity () {
            Collections.sort(planes, new Comparator<Plane>() {
                public int compare(Plane plane1, Plane plane2) {
                    return plane1.getMinLoadCapacity() - plane2.getMinLoadCapacity();
                }
            });
            return this;
        }

        public List<? extends Plane> getPlanes () {
            return planes;
        }

        private void print (Collection < ? extends Plane > collection){
            Iterator<? extends Plane> iterator = collection.iterator();
            while (iterator.hasNext()) {
                Plane plane = iterator.next();
                System.out.println(plane);
            }
        }

        @Override
        public String toString () {
            return "Airport{" +
                    "Planes=" + planes.toString() +
                    '}';
        }


    }
