/**
 * @author Olatunde Ajibayo Ewuola on 11/12/2023
 */

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}