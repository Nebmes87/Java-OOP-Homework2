package service;

import data.StudentsGroup;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentsGroupService implements DataGroupService {
    @Override
    public void create(StudentsGroup studentsGroup) {
        WriterToTxt.writeGroup(studentsGroup,"group.txt");
    }

    @Override
    public StudentsGroup read(String fileName) {
        return ReaderFromTxt.readGroup("group.txt");
    }
}