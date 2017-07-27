
import java.io.File;

class MyCustomFilter extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File f) {
            return f.isDirectory() || f.getAbsolutePath().endsWith(".xlsx");
    }

    @Override
    public String getDescription() {
            return "Excel Documents";
    }
    
}