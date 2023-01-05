package com.mycompany.maratonajsf.flowbuilder;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

import com.mycompany.maratonajsf.bean.flowbuilder.TesteFlowBuilderNestedBean;

public class NewPendenciesFlowBuilder implements Serializable {
	
//	TesteFlowBuilderNestedBean testeFlowBuilderNestedBean = new TesteFlowBuilderNestedBean();
//
//	@Produces
//	@FlowDefinition
//	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
//		String flowId = "newpendencies";
//		flowBuilder.id("", flowId);
//		flowBuilder.viewNode(flowId, "/newpendencies/newpendencies.xhtml").markAsStartNode();
//		flowBuilder.returnNode("proceedToNewRegistration3").fromOutcome("/newregistration/newregistration3.xhtml");
//		flowBuilder.returnNode("exitToNewInicio").fromOutcome("/newregistration/newregistration.xhtml");
//		flowBuilder.inboundParameter("userName", "#{testeFlowBuilderNestedBean.userName}");
//		return flowBuilder.getFlow();
//	}
}
