package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Session implements Serializable {
    private Long thdId;

    private Long connId;

    private String user;

    private String db;

    private String command;

    private String state;

    private Long time;

    private BigDecimal progress;

    private Long rowsExamined;

    private Long rowsSent;

    private Long rowsAffected;

    private Long tmpTables;

    private Long tmpDiskTables;

    private String fullScan;

    private String lastWait;

    private String source;

    private String trxState;

    private String trxAutocommit;

    private String pid;

    private String programName;

    private String currentStatement;

    private String statementLatency;

    private String lockLatency;

    private String lastStatement;

    private String lastStatementLatency;

    private String currentMemory;

    private String lastWaitLatency;

    private String trxLatency;

    private static final long serialVersionUID = 1L;

    public Long getThdId() {
        return thdId;
    }

    public void setThdId(Long thdId) {
        this.thdId = thdId;
    }

    public Long getConnId() {
        return connId;
    }

    public void setConnId(Long connId) {
        this.connId = connId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public Long getTmpTables() {
        return tmpTables;
    }

    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    public String getFullScan() {
        return fullScan;
    }

    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    public String getLastWait() {
        return lastWait;
    }

    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getCurrentStatement() {
        return currentStatement;
    }

    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    public String getLastStatement() {
        return lastStatement;
    }

    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }

    public String getLastStatementLatency() {
        return lastStatementLatency;
    }

    public void setLastStatementLatency(String lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }

    public String getTrxLatency() {
        return trxLatency;
    }

    public void setTrxLatency(String trxLatency) {
        this.trxLatency = trxLatency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", thdId=").append(thdId);
        sb.append(", connId=").append(connId);
        sb.append(", user=").append(user);
        sb.append(", db=").append(db);
        sb.append(", command=").append(command);
        sb.append(", state=").append(state);
        sb.append(", time=").append(time);
        sb.append(", progress=").append(progress);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", tmpTables=").append(tmpTables);
        sb.append(", tmpDiskTables=").append(tmpDiskTables);
        sb.append(", fullScan=").append(fullScan);
        sb.append(", lastWait=").append(lastWait);
        sb.append(", source=").append(source);
        sb.append(", trxState=").append(trxState);
        sb.append(", trxAutocommit=").append(trxAutocommit);
        sb.append(", pid=").append(pid);
        sb.append(", programName=").append(programName);
        sb.append(", currentStatement=").append(currentStatement);
        sb.append(", statementLatency=").append(statementLatency);
        sb.append(", lockLatency=").append(lockLatency);
        sb.append(", lastStatement=").append(lastStatement);
        sb.append(", lastStatementLatency=").append(lastStatementLatency);
        sb.append(", currentMemory=").append(currentMemory);
        sb.append(", lastWaitLatency=").append(lastWaitLatency);
        sb.append(", trxLatency=").append(trxLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}