package org.tahmed30;
import java.util.logging.*;
public final class SampleLogger {
    static Logger logger = Logger.getLogger(SampleLogger.class.getName());

    public static void main(String... args) {

        logger.config("this is config");
        logger.setLevel(Level.INFO);
        logger.info("this is info");
        logger.setLevel(Level.WARNING);
        logger.warning("this is a warning");
        logger.setLevel(Level.SEVERE);
        logger.severe("this is severe");
    }

}