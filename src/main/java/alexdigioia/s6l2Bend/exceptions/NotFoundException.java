package alexdigioia.s6l2Bend.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("L'elemento con id " + id + " non è stato trovato!");
    }
}