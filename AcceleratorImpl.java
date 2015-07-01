/*
		* This is Java implementation of the atomic component ac.getName
		*/
		
		IF !ac.getComputationUnit.getPackageName.emptypackage ac.getComputationUnit.getPackageName;ENDIF
		
		import java.util.*;
		
		public class ac.getNameSUFFIX implements ac.getName {
/**
 * Constructor of atomic component c.getName
 */
public c.getNameSUFFIX(IF !dataElements.empty Map<String, Object> vals ENDIF) {
FOR de : dataElements
	this._de.getName = (de.getDataType) vals.get("de.getName");
ENDFOR 
}public  void  s.getName (
    		FOR i : inputs SEPARATOR ', '
    			i.getDataType.toString i.getName
    		ENDFOR ) {
    			IF outputs.size() > 1
    				Map<String, Object> returnValues = new HashMap<String, Object>();
    				FOR o : outputs
    					o.getDataType.toString o.getName = null;
    					returnValues.put("o.getName", o.getName);
    				ENDFOR
    			ELSEIF outputs.size() == 1
    				outputs.get(0).getDataType.toString outputs.get(0).getName = null;
    			ENDIF
    			// TODO: auto-generated code, to be implemented by developers
    			IF outputs.size() == 1
    				return outputs.get(0).getName;
    			ELSEIF outputs.size() > 1
    				return returnValues;
    			ENDIF
    		}public  void  s.getName (
    		FOR i : inputs SEPARATOR ', '
    			i.getDataType.toString i.getName
    		ENDFOR ) {
    			IF outputs.size() > 1
    				Map<String, Object> returnValues = new HashMap<String, Object>();
    				FOR o : outputs
    					o.getDataType.toString o.getName = null;
    					returnValues.put("o.getName", o.getName);
    				ENDFOR
    			ELSEIF outputs.size() == 1
    				outputs.get(0).getDataType.toString outputs.get(0).getName = null;
    			ENDIF
    			// TODO: auto-generated code, to be implemented by developers
    			IF outputs.size() == 1
    				return outputs.get(0).getName;
    			ELSEIF outputs.size() > 1
    				return returnValues;
    			ENDIF
    		}}