package dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import domain.BlockSection;
public class BlockSectionDA {

    public BlockSectionDA() throws FileNotFoundException {

        Scanner blockSectionInfo = new Scanner(
                new FileReader("./src/blockSection.csv"));

        while(blockSectionInfo.hasNext()) {

            String[] rowBlockSection = blockSectionInfo.nextLine().split(",");
            BlockSection blockSection = new BlockSection(rowBlockSection[0].trim(), rowBlockSection[1].trim(), rowBlockSection[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());
            blockSection.setTotalStudents(studentDA.getStudentList().size());

            System.out.print(blockSection);
        }

        blockSectionInfo.close();

    }
}
