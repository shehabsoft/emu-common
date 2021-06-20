package org.emu.common.events;

import org.emu.common.dto.IDto;
import org.emu.common.messages.Message;


public abstract class AbstractEvent<T extends IDto ,S> extends Message<T>{
	private String executionId;
	private S status;
	public  abstract void setType() ;

	public AbstractEvent() {
		super();
		setType() ;
	};
    
    public AbstractEvent(T t, S status) { 
    	//super(t.getId()+"",t);
        this.status = status;
        setType() ;
    }
    
    public AbstractEvent(T t, S status,String traceId) {
    	//super(t.getId()+"",traceId,t);
        this.status = status;    
        setType() ;
    }


	public S getStatus() {
		return status;
	}


	public void setStatus(S status) {
		this.status = status;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}
}
