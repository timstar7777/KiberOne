package KiberCW.class_10;

public class Phone  implements MemoryUsable {
    public Phone(String model, float display, int sizeRAM, boolean isDualCameraSystem) {

    }

    @Override
    public String useMemory() {
        return "Ты можешь использовать память, пока она не заполнит sizeRAM гб";
    }
    /*public String useMemory(int currentSizeRAM) {
        if (sizeRam > currentSizeRAM) {
            return "32гб доступно к использованию";
        } else {
            return "Недостаточно памяти на устройстве";
        }

    }

*/
}
