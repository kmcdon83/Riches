<%@ include file="common/moduleInclude.jsp" %>

<tiles:insertTemplate template="/pages/tiles/header.jsp">
    <tiles:putAttribute name="pageDesc" value="Message Details"/>
</tiles:insertTemplate>
<tiles:insertTemplate template="/pages/content/ViewMessage.jsp"/>
<tiles:insertTemplate template="/pages/tiles/footer.jsp"/>
