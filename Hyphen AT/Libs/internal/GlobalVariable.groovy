package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object qa_env
     
    /**
     * <p></p>
     */
    public static Object user
     
    /**
     * <p></p>
     */
    public static Object pass
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['qa_env' : 'https://qa.hs.com/Build/LogIn.asp', 'user' : 'hswarranty', 'pass' : 'password'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        qa_env = selectedVariables['qa_env']
        user = selectedVariables['user']
        pass = selectedVariables['pass']
        
    }
}
