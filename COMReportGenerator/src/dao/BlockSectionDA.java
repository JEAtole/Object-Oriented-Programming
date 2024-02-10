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

            String rowBlockSection = blockSectionInfo.nextLine();
            String[] rowBlockSectionSpecific = rowBlockSection.split(",");

            BlockSection blockSection = new BlockSection();

            blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
            blockSection.setDescription(rowBlockSectionSpecific[1].trim());
            blockSection.setAdviser(rowBlockSectionSpecific[2].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());
            blockSection.setTotalStudents(studentDA.getStudentList().size());

            System.out.print(blockSection);
        }

        blockSectionInfo.close();

    }
}
