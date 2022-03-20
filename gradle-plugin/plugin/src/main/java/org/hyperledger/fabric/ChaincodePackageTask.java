package org.hyperledger.fabric;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;



public class ChaincodePackageTask extends DefaultTask {

    // @InputFile
    //  abstract public RegularFileProperty getFile2();
    // @OutputFile
    // abstract public  RegularFileProperty getResultFile();

    @TaskAction
    public void perform() {
        System.out.println("===>> Packaging");
        ChaincodePackageExtension extension = getProject().getExtensions().findByType(ChaincodePackageExtension.class);

        System.out.println(extension.getConnectionJSON());
    }
}